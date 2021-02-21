pipeline {
    agent any

    stages {
        stage('Compile project') {
            steps {
                withMaven() {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}