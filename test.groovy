agent {
        label 'ss-build-lab'
          }
        
    stages {
        stage('Init'){
            agent {
                    label 'Windows-Slave'
                  }
        	steps{
        		    script{		
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