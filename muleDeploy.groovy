muleDeploy {
    // version of the tool
    version '1.0'

    apiSpecification {
        name 'mulesoft-explorer'
    }

    // policies {
    //     clientEnforcementPolicyBasic {
    //         // version is optional (will use version in this library by default)
    //         version '1.2.3'
    //         // can supply paths just like above if necessary
    //     }
    // }

    cloudHubV2Application {
        environment params.env
        file params.appArtifact
        cryptoKey params.cryptoKey
        autoDiscovery {
            clientId params.autoDiscClientId
            clientSecret params.autoDiscClientSecret
        }
        cloudHubAppPrefix 'bethel'
        // analyticsAgentEnabled true
        workerSpecs {
            muleVersion '4.8.0'
            workerType params.workerType
            workerCount params.workerCount.toInteger()
            awsRegion params.region
            // objectStoreV2Enabled params.osv2Enabled.toBoolean()
            // usePersistentQueues true
            // customLog4j2Enabled false
            // staticIpEnabled false
        }
        // optional from here on out
        /*
        appProperties([
            someProp: 'someValue'
        ])
        otherCloudHubProperties([
            some_ch_value_we_havent_covered_yet: true
        ])
        */
    }

}