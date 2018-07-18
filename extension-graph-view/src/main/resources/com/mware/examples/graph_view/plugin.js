require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.view', {
        componentPath: 'com.mware/examples/graph_view/View',
        className: 'com.mware-examples-graph-view'
    });

});
