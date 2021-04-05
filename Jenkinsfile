pipeline{
    agent any 

    stages {
        stage ("build") {
            steps {
                echo "Building the application ..."
                withMaven(maven: 'maven_3.6.3') {
                    sh 'mvn clean compile package install'
                }
            }
        }
    }
}