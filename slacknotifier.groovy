#!/usr/bin/env groovy
def call(String buildResult) {
if ( buildResult == "SUCCESS" ) {
slackSend color: "good", message: "Job: ${env.JOB_NAME}
}
else if( buildResult == "FAILURE" ) {
slackSend color: "danger", message: "Job: ${env.JOB_NAM
}
else if( buildResult == "UNSTABLE" ) {
slackSend color: "warning", message: "Job: ${env.JOB_NA
}
