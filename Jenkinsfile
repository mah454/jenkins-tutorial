pipeline{
    agent any 

    stages {
        stage ("build project") {
            steps {
                echo "Building the application ..."
                withMaven(maven: 'maven-3.6.3') {
                    sh 'mvn clean compile package install'
                }
            }
        }
        stage ("remove useless files") {
            steps {
                sh 'ls -l'
            }
        }
    }
}