pipeline {
    agent any
    tools {
        maven 'javaMaven' 
    }
    environment{
      JAVA_HOME='C:\\Program Files\\Java\\jdk-17'
      MAVEN_HOME='C:\\Program Files\\apache-maven-3.9.9'
      PATH = "C:\\WINDOWS\\SYSTEM32"
      SONAR_SCANNER_PATH='C:\\Users\\nnavi\\OneDrive\\Desktop\\sonar-scanner-cli-6.2.1.4610-windows-x64\\sonar-scanner-6.2.1.4610-windows-x64\\bin'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    bat '''
                    set PATH=%JAVA_HOME%;%MAVEN_HOME%;%PATH%
                    mvn clean install
                    '''
                }
            }
        }
        stage('Run Tests') {
            steps {
                script{
                    bat '''
                    set PATH=%JAVA_HOME%;%MAVEN_HOME%;%PATH%
                    mvn test
                    '''
                }
            }
        }
        stage('Coverage') {
            steps {
                script{
                    bat '''
                    set PATH=%JAVA_HOME%;%MAVEN_HOME%;%PATH%
                    mvn verify
                    '''
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    bat '''
                    set PATH=%JAVA_HOME%;%MAVEN_HOME%;%SONAR_SCANNER_PATH%;%PATH%
                    mvn clean verify sonar:sonar ^
                                     -Dsonar.projectKey=navin-maven ^
                                     -Dsonar.projectName=navin-maven ^
                                     -Dsonar.host.url=http://localhost:9000 ^
                                     -Dsonar.token=sqp_f70acc90fa56b2e64447d5537ac554cd22e95fb0 ^
                                     -Dsonar.coverage.jacoco.xmlReportPaths=target/surefire-reports/TEST-com.example.automation.LoginAutomationTest.xml
                                     
                  '''
                }
            }
        }
    }
    post {
        success {
            echo 'Build and analysis completed successfully'
        }
        failure {
            echo 'Build or analysis failed'
        }
    }
}
