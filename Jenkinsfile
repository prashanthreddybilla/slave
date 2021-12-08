//def getEnvVar(String paramName){
 //return sh (script: "grep '${paramName}' ENV_VARS/project.properties|cut -d'=' -f2", returnStdout: true).trim();
//}
//test.properties
//Monday=abcdef
//Tuesday=kfgh
//def props = readProperties  file: 'dir/my.properties'
//file:'/var/lib/jenkins/jobs/abc/test.properties
def props = readProperties  file:'//ENV_VARS/project.properties'
def Var1= props['JCLASS_NAME']
def Var2= props['JCLASS_VERSION']
def Var3= props['JCLASS_SUBVERSION']


pipeline {
    
    agent {
        label 'master'
          }
        
    stages {
        

     stage('copy jarfiles') {
           steps {
                    script{
                      echo "Var1=${Var1}"
                    echo "Var2=${Var2}"
                    }
                 }
        }
        
        
        

        
    }
         
}