static final String region(){
    return "us-east-1"
}
static final String nexusURL(){
    return "nexus.devopswithaws.store:8081"
}
static final String account_id(){
    return "192990275288"
}

def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "192990275288"
        case 'qa':
            return "192990275288"
        case 'uat':
            return "192990275288"
        case 'pre-prod':
            return "192990275288"
        case 'prod':
            return "192990275288"
        default:
            return "nothing"
    } 
}