pipeline {
    agent {
            label "maven"
         }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Ravshann/geohashUDF'
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