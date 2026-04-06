🚀 AWS CI/CD Automation using Jenkins, Docker & Docker Compose
📌 Overview

This is a self-driven DevOps project focused on building an end-to-end CI/CD pipeline using GitHub, Jenkins, Docker, Docker Compose, and AWS EC2.

The objective of this project is to gain hands-on experience in automating application builds and deploying containerized applications in a cloud environment using Docker Compose for orchestration (without Kubernetes).

🏗️ Tools & Technologies

AWS EC2

Jenkins (Pipeline as Code)

Git & GitHub

Docker

Docker Compose

Linux (Amazon Linux / Ubuntu)

🔄 CI/CD Workflow

Code is pushed to the GitHub repository

Jenkins pipeline is triggered automatically

Application is built and packaged

Docker image is created using Dockerfile

Docker Compose deploys or updates containers on AWS EC2

Application becomes accessible through configured ports

⚙️ Key Features

Automated CI/CD pipeline using Jenkins

Docker-based application containerization

Multi-service deployment using Docker Compose

Deployment of multiple applications on a single EC2 instance

Port-based isolation for services

Container restart policies for failure handling

Minimal-downtime redeployments

Deployment validation and troubleshooting on Linux

🐳 Docker Compose Deployment

Docker Compose is used to manage and run multiple application containers on a single EC2 instance.

Example Configuration
services:
  app1:
    image: app1:latest
    ports:
      - "8081:8080"
    restart: always

  app2:
    image: app2:latest
    ports:
      - "8082:8080"
    restart: always


Why Docker Compose?

Simple and lightweight orchestration

Faster setup and easier debugging

Ideal for small to mid-scale systems

Cost-effective alternative to Kubernetes on EC2

☁️ AWS Deployment

Applications deployed on AWS EC2

Security Groups configured for application access

SSH used for deployment verification and troubleshooting

Containers managed directly using Docker Engine

🧠 Key Learnings

Designing CI/CD pipelines from scratch

Building and managing Docker images

Deploying multi-service applications using Docker Compose

Handling container restarts and redeployments

Troubleshooting Jenkins, Docker, and Linux issues

Practical experience with AWS EC2 deployments


This project demonstrates hands-on experience in:

CI/CD automation

Docker & Docker Compose

AWS EC2

Linux troubleshooting

Application deployment workflows

👨‍💻 About This Project

This project was built as part of my transition into a DevOps / Cloud Engineering role and reflects practical, hands-on implementation rather than theoretical learning
--test webhook
