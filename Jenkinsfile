pipeline {
	environment {
    	//registry = 'pavan93/testimage'
    	//registryCredential = ‘dockerhub’
    	dockerImage = ''
    }
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Maven install') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Build Docker Image'){
        	steps{
        		script{
        			dockerImage = docker.build ("pavan93/testimage:latest")
        		}
        	}
        }
        stage('Push docker image to dockerHub'){
        	steps{
        		script{
        				dockerImage.push("latest")
        			}
        		}
        	}
        }
}