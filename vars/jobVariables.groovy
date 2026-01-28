def call(String JOB_NAME){
    return [
            projectName : 'demo-library-test',
            jobName : JOB_NAME.tokenize('/')[1],
            branch : "main",
            pom : 'pom.xml',


            organizationName : "altyapistaj",

            gitAdressAndName : JOB_NAME.tokenize('/')[1]
    ]

}

