require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.web.dashboard.item', {
        title: 'Concept Type Counts',
        description: 'Show total counts for entity types',
        identifier: 'com.mware-examples-dashboard-item',
        report: {
            defaultRenderer: 'org-bigconnect-pie',
            endpoint: '/vertex/search',
            endpointParameters: {
                q: '*',
                size: 0,
                filter: '[]',
                aggregations: [
                    {
                        type: 'term',
                        name: 'field',
                        field: ONTOLOGY_CONSTANTS.PROP_CONCEPT_TYPE
                    }
                ].map(JSON.stringify)
            }
        }
    });

    bc.registry.registerExtension('org.bigconnect.web.dashboard.item', {
        title: 'React Component',
        description: 'Example React Component',
        identifier: 'com.mware-examples-dashboard-item-react',
        componentPath: 'com/mware/examples/dashboard_item/React',
        configurationPath: 'com/mware/examples/dashboard_item/Config'
    });

});
