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
    
        

        stage ('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
            }
			post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
            
        }
        
      stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                    // Optionally use a Maven environment you've configured already
                   
                        bat 'mvn sonar:sonar'
                    }
                }
            }
        stage ('Pushing War file to Server') {
            steps {
               // echo "Deploying"
              
               //bat 'echo %CD%'  
               
            bat 'del C:\\Tomcat\\webapps\\konakart.war'
		    sleep 10
            }
        }
	    
	   
        stage ('Deploy To Server') {
            steps {
                echo "Deploying"
              
               //bat 'echo %CD%'  
               
             bat '''cd target
            copy konakart.war C:\\Tomcat\\webapps
            '''
           sleep 10
            }
        }
        
}
    }

