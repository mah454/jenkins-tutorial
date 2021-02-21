pipeline {
    agent any

    stages {
        stage('Compile project') {
            steps {
                withMaven(maven: 'maven_3.5.0') {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}