require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.graph.view', {
        componentPath: 'com/mware/examples/graph_view/View',
        className: 'com.mware-examples-graph-view'
    });

});
