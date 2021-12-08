def getEnvVar(String paramName){

 //return sh (script: "grep '${paramName}' ENV_VARS/project.properties|cut -d'=' -f2", returnStdout: true).trim();
 
 return bat (script: 'cd C:\\Program Files\\Git && .\\git-bash.exe grep %paramName% ENV_VARS/project.properties|cut -d'=' -f2', returnStdout: true).trim();
 
 //sh (script: "grep 'JCLASS_NAME' ENV_VARS/project.properties|cut -d'=' -f2"
 
 //return bat (script: "set str = 'find '${paramName}' ENV_VARS/project.properties' set str = %str:'${paramName}'=% echo %str%" , returnStdout: true ).trim();
 //return bat (script: "find "%paramName%"  ENV_VARS/project.properties" , returnStdout: true ).trim();
}

pipeline {
    
agent {
        label 'Windows-Slave'
          }
        
    stages {
        stage('Init'){
            agent {
                    label 'Windows-Slave'
                  }
        	steps{
            
        		    script{	
                    //call C:\Program Files\Git 	git-bash.exe
                    // bat label: '', script: 'call C:\\Program Files\\Git\\git-bash.exe'
                    //bat label: '', script: 'cd C:\\Program Files\\Git && .\\git-bash.exe %WORKSPACE% '
                    env.JCLASS_NAME = getEnvVar('JCLASS_NAME')		
				    env.JCLASS_VERSION = getEnvVar('JCLASS_VERSION')
                    env.JCLASS_SUBVERSION = getEnvVar('JCLASS_SUBVERSION')
                    env.GIT_BRANCH = getEnvVar('GIT_BRANCH')
                    env.GIT_CREDENTIALS_ID = getEnvVar('GIT_CREDENTIALS_ID')
                    env.GIT_URL = getEnvVar('GIT_URL')
                    env.GCP_CREDENTIALS_ID = getEnvVar('GCP_CREDENTIALS_ID')
                    env.CLOUD_STORAGE_BUCKET_NAME = getEnvVar('CLOUD_STORAGE_BUCKET_NAME')
                    env.PATTERN = getEnvVar('PATTERN')
                
                
                
					//env.CLUSTER_CONTEXT=getEnvVar('CLUSTER_CONTEXT')
					//env.NAMESPACE=getEn//
				        }
			      }
            }
    
         
        stage('versioning the exe') {
            steps {
                     bat label: '', script: '''
                     md %workspace%\\installanywhere\\Scout-Solutions\\DesktopViews\\%JCLASS_NAME%-%JCLASS_VERSION%
                     copy %WORKSPACE%\\installanywhere\\Scout-Solutions\\DesktopViews\\DesktopViews_Build_Output\\Default_Configuration\\Web_Installers\\InstData\\Windows\\NoVM\\*.exe %WORKSPACE%\\installanywhere\\Scout-Solutions\\DesktopViews\\%JCLASS_NAME%-%JCLASS_VERSION%
                     cd %WORKSPACE%\\installanywhere\\Scout-Solutions\\DesktopViews\\%JCLASS_NAME%-%JCLASS_VERSION%
                     rename "Install.exe" "%JCLASS_NAME%-%JCLASS_VERSION%.%JCLASS_SUBVERSION%-Install.exe"
                     '''      
                  }
        }
        
        
    }
         
}