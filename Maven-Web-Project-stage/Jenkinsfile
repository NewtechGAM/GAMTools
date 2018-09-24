#!groovy

node {
	   
	stage('Checkout'){

          checkout scm
       }

       stage('BuildArtifact'){

          sh 'mvn install'
       }
	   
      stage('Sonar') {
                    //add stage sonar
                    sh 'mvn sonar:sonar'
                }
       
}
