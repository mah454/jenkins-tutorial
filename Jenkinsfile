
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
                sh 'rm -rf docker/ROOT/META-INF/maven/org.example/jenkins-tutorial/pom.xml ' 
                // sh 'rm -rf docker/ROOT/WEB-INF/classes/globalCountriesStatesCities.json ' 
                // sh 'rm -rf docker/ROOT/app/' 
                // sh 'rm -rf docker/ROOT/fonts/' 
                // sh 'rm -rf docker/ROOT/css/' 
                // sh 'rm -rf docker/ROOT/doc/' 
                // sh 'rm -rf docker/ROOT/ajax/' 
                // sh 'rm -rf docker/ROOT/php/' 
                // sh 'rm -rf docker/ROOT/sound/' 
                // sh 'rm -rf docker/ROOT/tabledocs/ ' 
                // sh 'rm -rf docker/ROOT/js' 
                // sh 'rm -rf docker/ROOT/img/ ' 
                // sh 'rm -rf docker/ROOT/hamsamstore/' 
                // sh 'rm -rf docker/ROOT/jsondoc/' 
                // sh 'rm -rf docker/ROOT/*.jsp' 
                // sh 'rm -rf docker/ROOT/WEB-INF/classes/*.xlsx' 

            } 
        }
    }
}