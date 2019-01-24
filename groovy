def readpom;
pipeline {
    agent any
    tools { 
        maven 'apache-maven-3.5.3' 
        jdk 'JDK-8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
            
            }
        }
        
       
       stage('Code Checkout') {
            steps { 
                
                git credentialsId: '3517e891-bea1-4cb0-a26f-bdc5a295adbe', url: 'https://github.com/kislay4/MyRepo.git'
            }
        }
	   stage('ReadPom') {
	        steps{
			     
			    script {
	                readpom = readMavenPom file:'pom.xml';
	                echo "groupId is  ${readpom.groupId}"
			echo "artifactId is  ${readpom.artifactId}"
			echo "packaging is  ${readpom.packaging}"
			echo "version is  ${readpom.version}"
			echo "name is  ${readpom.name}"
			
			    }
	           
            }
	    
	    }
	   stage('Print details') {
            steps { 
                echo "groupId is  ${readpom.groupId}"
			echo "artifactId is  ${readpom.artifactId}"
			echo "packaging is  ${readpom.packaging}"
			echo "version is  ${readpom.version}"
			echo "name is  ${readpom.name}"
                
            }
        }
	}
}
