//def getEnvVar(String paramName){
 //return sh (script: "grep '${paramName}' ENV_VARS/project.properties|cut -d'=' -f2", returnStdout: true).trim();
//}
//test.properties
//Monday=abcdef
//Tuesday=kfgh
//def props = readProperties  file: 'dir/my.properties'
//file:'/var/lib/jenkins/jobs/abc/test.properties

def props = readProperties  file:'/var/lib/jenkins/workspace/pipelineutility/ENV_VARS/project.properties'

pipeline {
    
      def Var1= props['JCLASS_NAME']
def Var2= props['JCLASS_VERSION']
def Var3= props['JCLASS_SUBVERSION']
  
    agent {
        label 'master'
          }
        
    stages {
        

     stage('copy jarfiles') {
           steps {
                    script{
                      def Var1= props['JCLASS_NAME']
def Var2= props['JCLASS_VERSION']
def Var3= props['JCLASS_SUBVERSION']
  
                      echo "Var1=${Var1}"
                    echo "Var2=${Var2}"
                    }
                 }
        }
        
        
        

        
    }
         
}