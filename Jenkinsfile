pipeline {
    agent {
            label "maven"
         }
    stages {
        stage('Checkout') {

            steps {
                git
                        url: 'https://github.com/Ravshann/geohashUDF'

            sh "ls -lat"
            }
        }
        stage('Build') {
            steps{
                sh "mvn package"
            }
        }

	stage('Tests') {
            steps{
                sh "mvn test"
            }
        }
    }
}