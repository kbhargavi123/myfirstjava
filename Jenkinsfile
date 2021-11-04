pipeline {
    agent any

     tools { 
                  maven 'maven_3.8.3' 
                  
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
                echo "M2_HOME = ${M2_HOME}"
                sh "${M2_HOME}/bin/mvn clean install"
             
            }
        }
   }
}
