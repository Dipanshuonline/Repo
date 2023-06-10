pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Perform build steps here
                sh 'echo "Building..."'
            }
        }
        
        stage('Test') {
            steps {
                // Perform test steps here
                sh 'echo "Testing..."'
            }
        }
        
        stage('Deploy') {
            steps {
                // Perform deployment steps here
                sh 'echo "Deploying..."'
            }
        }
    }
    
    post {
        always {
            // Perform cleanup steps here
            sh 'echo "Performing cleanup..."'
        }
        
        success {
            // Actions to be performed on success
            sh 'echo "Pipeline executed successfully"'
        }
        
        failure {
            // Actions to be performed on failure
            sh 'echo "Pipeline execution failed"'
        }
    }
}
