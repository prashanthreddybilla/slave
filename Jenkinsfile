def getEnvVar(String paramName){
 //return sh (script: "echo  ", returnStdout: true).trim();
 return sh (script: "$paramName" , returnStdout: true).trim();
}
//
//echo "orgin/8.4" > b.txt |cut -d "/" -f 2 b.txt >c.txt | cat c.txt | cut -d "." -f 1
//test.properties
//Monday=abcdef
//Tuesday=kfgh
//def props = readProperties  file: 'dir/my.properties'
//file:'/var/lib/jenkins/jobs/abc/test.properties

pipeline {
    
 
//def Var2= props['JCLASS_VERSION']
//def Var3= props['JCLASS_SUBVERSION']
  
    agent {
        label 'master'
          }
 

          //environment{
 //def Var1= "${GIT_BRANCH}"
  //def version = getEnvVar('$Var1')

            //version = "$BRANCH_NAME"
          //}
        
    stages {
        

     stage('copy jarfiles') {
           steps {
                    script{
                     sh 'echo $GIT_BRANCH > a.txt | cat a.txt'
                     env.version = getEnvVar('cat a.txt | cut -b 8-8')
                     env.subversion = getEnvVar('cat a.txt | cut -b 8-')
                      //def props = readProperties  file:'/var/lib/jenkins/workspace/pipelineutility/ENV_VARS/project.properties'

                      //def Var1= props['JCLASS_NAME']
                      //def Var2= props['JCLASS_VERSION']
                      //def Var3= props['JCLASS_SUBVERSION']
  
                      //echo "$BRANCH_NAME"
                     // echo "$GIT_BRANCH"
                     //echo "hello $var1"
                    //echo "$Var1"
                     
                     echo "hello ${version} from method"
                     echo "the subvesrion is${subversion}"
                     //echo "$version"
                     //echo "%version%" 
                    }
                 }
        }
        
        
        

        
    }
         
}
