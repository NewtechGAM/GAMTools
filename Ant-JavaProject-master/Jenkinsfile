
#! groovy
node{
 stage('Source'){
     git 'https://github.com/devopstrainingblr/Ant-JavaProject.git'
   
   if (env.BRANCH_NAME == 'master') {
  stage 'Only on master'
  println 'This happens only on master'
} else {
  stage 'Other branches'
  println "Current branch ${env.BRANCH_NAME}"
}
 }
 
 stage('Build'){
    /* bat "ant -f build-mt.xml" */ /*For windows machines*/
    sh "ant -f build-mt.xml" 
 }
 stage('Send Email'){
     mail bcc: 'mithunreddytechnologies@gmail.com', body: 'Buils is done', cc: '', from: '', replyTo: '', subject: 'Build Status', to: 'devopstrainingblr@gmail.com'
 }
 /*stage('Archive'){
  archiveArtifacts '/Users/bhaskarreddyl/.jenkins/workspace/Pipeline-Project-Ant-Web/dist/SampleAntProject.war'
 }*/
}

