pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Rahuld6/vpc-jenkins-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh '''
                nohup java -jar target/*.jar > app.log 2>&1 &
                '''
            }
        }
    }

    post {
        success {
            echo 'Build, archive, and deploy completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

