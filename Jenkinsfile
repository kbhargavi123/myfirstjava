pipeline {
    agent any

     tools { 
                  maven 'maven3.8.3' 
                  jdk 'java9'
                  
               }

    stages {
        stage('checkout scm') {
            steps {
                git branch: 'main', url: 'https://github.com/kbhargavi123/myfirstjava.git'
                echo 'checkedout scm'
            }
        }
        stage('build') {
            steps {
                // echo "M2_HOME = ${M2_HOME}"
                sh "mvn clean install"
             
            }
        }
   }
}
