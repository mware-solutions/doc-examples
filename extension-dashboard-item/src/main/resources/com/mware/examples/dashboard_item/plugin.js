require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.web.dashboard.item', {
        title: 'Concept Type Counts',
        description: 'Show total counts for entity types',
        identifier: 'com.mware-examples-dashboard-item',
        report: {
            defaultRenderer: 'com.mware-pie',
            endpoint: '/vertex/search',
            endpointParameters: {
                q: '*',
                size: 0,
                filter: '[]',
                aggregations: [
                    {
                        type: 'term',
                        name: 'field',
                        field: 'http://bigconnect.io#conceptType'
                    }
                ].map(JSON.stringify)
            }
        }
    });

    bc.registry.registerExtension('com.mware.web.dashboard.item', {
        title: 'React Component',
        description: 'Example React Component',
        identifier: 'com.mware-examples-dashboard-item-react',
        componentPath: 'com.mware/examples/dashboard_item/React',
        configurationPath: 'com.mware/examples/dashboard_item/Config'
    });

});
