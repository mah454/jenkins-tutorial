pipeline {
    agent any

    stages {
        stage('Compile project') {
            steps {
                withMaven(maven: 'maven_3.6.3') {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}
