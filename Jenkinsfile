
import java.io.File;



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
                echo "Extract war to ROOT directory"
                unzip zipFile: 'target/hello.war', dir: 'docker/ROOT'

                echo "Remvoe files"
                whateverFunction()
                // deleteFile("ROOT/META-INF/maven/org.example/jenkins-tutorial/pom.xml")
            } 
        }
    }
}


void whateverFunction() {
    sh 'ls /'
}