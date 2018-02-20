#!/usr/bin/env groovy
pipeline {
    agent {
        label 'xcode8.3'
    }


    stages {
        stage('Test') {
            steps {
                sh 'echo $Test'
            }
        }



    }
    post {
        success {
           
            cleanWs()
        }
    }
}