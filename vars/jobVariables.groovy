def call(String JOB_NAME){
    '''
    return [
            projectName : 'demo-library-test',
            jobName : "",
            pom : 'pom.xml',

            branch : "library-dependency",
            customWorkspace : "workspace/" + JOB_NAME + "/",
            gitPathName : "altyapistaj",
            gitAdressAndName : "demo-service"
    ]
    '''
    return [
            projectName : 'demo-library-test',
            jobName : JOB_NAME.tokenize('/')[1],
            branch : "master",
            pom : 'pom.xml',


            customWorkspace : "workspace/" + JOB_NAME + "/",
            gitAdressAndName : "demo-service"
    ]

}

