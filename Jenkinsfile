pipeline {
    agent any

    stages {
        stage('Fetch') {
            steps {
                git credentialsId: '98899ff4-d48a-47f0-a828-c7c4e6684660', url: 'http://linkit.uz:3000/jakhashr/test-java'
                echo 'Fetch complete'
            }
        }

         stage('Clean') {
            steps {
                sh './gradlew clean'
                echo 'Clean complete'
            }
         }

         stage('Build') {
            steps {
                sh './gradlew build --info --build-cache'
                echo 'Build complete'
                script {
                    env.BUILDSUCCESS = 'true'
                }
            }
        }

        stage('Test') {
            when {
                environment name: 'BUILDSUCCESS', value: 'true'
            }
             steps {
                sh './gradlew clean test --no-daemon'
                junit 'build/test-results/**/*.xml'
             }
        }

         stage('Bundle') {
            steps {
                sh './gradlew jar'
                echo 'Jar building complete'
            }
        }
    }

}