pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        timestamps()
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Deploy with Docker Compose') {
            steps {
                sh '''
                  echo "🚀 Building and deploying full stack using Docker Compose"
                  cd /opt/java-stack

                  docker compose down
                  docker compose build
                  docker compose up -d
                '''
            }
        }

        stage('Verify') {
            steps {
                sh '''
                  echo "✅ Verifying services"
                  docker compose ps
                '''
            }
        }
    }

    post {
        success {
            echo "🎉 Full stack deployed successfully"
        }
        failure {
            echo "❌ Deployment failed"
        }
    }
}

