pipeline{
    agent any 

    stages {
        stage ("build") {
            steps {
                echo "Building the application ..."
                withMaven() {
                    sh 'mvn clean compile package install'
                }
            }
        }
    }
}