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
                withMaven(maven: 'mvn'){
                    sh "mvn package"
                }
            }
        }

	    stage('Tests') {
            steps{
                withMaven(maven: 'mvn'){
                    sh "mvn test"
                }
            }
        }
    }
}