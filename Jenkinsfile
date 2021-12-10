//def getEnvVar(String paramName){
 //return sh (script: "grep '${paramName}' ENV_VARS/project.properties|cut -d'=' -f2", returnStdout: true).trim();
//}
//test.properties
//Monday=abcdef
//Tuesday=kfgh
//def props = readProperties  file: 'dir/my.properties'
//file:'/var/lib/jenkins/jobs/abc/test.properties


pipeline {
    
      def Var1= "$GIT_BRANCH"
//def Var2= props['JCLASS_VERSION']
//def Var3= props['JCLASS_SUBVERSION']
  
    agent {
        label 'master'
          }

          //environment{
            //version = "$BRANCH_NAME"
          //}
        
    stages {
        

     stage('copy jarfiles') {
           steps {
                    script{
                      //def props = readProperties  file:'/var/lib/jenkins/workspace/pipelineutility/ENV_VARS/project.properties'

                      //def Var1= props['JCLASS_NAME']
                      //def Var2= props['JCLASS_VERSION']
                      //def Var3= props['JCLASS_SUBVERSION']
  
                      //echo "$BRANCH_NAME"
                      echo "$GIT_BRANCH"
                    //echo "$Var1"
                    }
                 }
        }
        
        
        

        
    }
         
}
