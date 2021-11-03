pipeline {
    agent any

    stages {
        stage('checkout scm') {
            steps {
                git branch: 'main', url: 'https://github.com/kbhargavi123/myfirstjava.git'
                echo 'checkedout scm'
            }
        }
        
     
     }
}