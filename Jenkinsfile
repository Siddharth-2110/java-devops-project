pipeline {
    agent any

    environment {
        // Lock Compose project identity (CRITICAL)
        COMPOSE_PROJECT_NAME = "java-stack"
    }

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

        stage('Build Applications') {
            steps {
                sh '''
                  echo "🔨 Building App-1"
                  cd java-jenkins-demo
                  mvn clean package -DskipTests

                  echo "🔨 Building App-2"
                  cd ../java-jenkins-demo-2
                  mvn clean package -DskipTests
                '''
            }
        }

        stage('Pre-flight Cleanup') {
            steps {
                sh '''
                  echo "🧹 Cleaning containers blocking required ports"
                  docker ps -q --filter "publish=8081" | xargs -r docker rm -f
                  docker ps -q --filter "publish=8082" | xargs -r docker rm -f
                '''
            }
        }

        stage('Build & Deploy with Docker Compose') {
            steps {
                sh '''
                  echo "🚀 Building and deploying full stack using Docker Compose"
                  docker compose down || true
                  docker compose build
                  docker compose up -d
                '''
            }
        }

        stage('Verify') {
            steps {
                sh '''
                  echo "✅ Verifying running services"
                  docker compose ps
                '''
            }
        }
    }

    post {
        success {
            echo "🎉 Full stack deployed successfully using Docker Compose"
        }
        failure {
            echo "❌ Deployment failed"
        }
    }
}
