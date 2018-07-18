require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.node.class', function(vertex, classes) {
        var name = _.findWhere(vertex.properties, { name: 'http://example.org/test#fullName' })
        var concept = _.findWhere(vertex.properties, { name: 'http://bigconnect.io#conceptType' })
        if (concept && concept.value === 'http://example.org/test#person' && !name) {
            classes.push('unknownName')
        }
    });

    bc.registry.registerExtension('com.mware.graph.style', function(cytoscapeStylesheet) {
         cytoscapeStylesheet.selector('node.unknownName')
             .style({
                 'opacity': '0.75'
             })
    });

});
