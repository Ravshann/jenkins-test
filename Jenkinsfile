pipeline {
    agent any
    tools {
        maven 'm3'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Ravshann/jenkins-test'
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