require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.graph.options', {
        identifier: 'com.mware-examples-graph-opts',
        optionComponentPath: 'com/mware/examples/graph_options/React'
    });

});
