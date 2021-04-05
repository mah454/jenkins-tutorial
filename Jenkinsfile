pipeline{
    agent any 
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk8'
    }
    stages {
        stage ("build") {
            steps {
                echo "Building the application ..."
                sh 'mvn clean compile package install'
            }
        }
    }
}