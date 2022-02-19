def call(Map config=[:]){
  pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello, People !!'
            }
        }
        stage('Test') {
            steps {
                echo 'I am back'
            }
        }
    }
}
}