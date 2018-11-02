require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.graph.node.class', function(vertex, classes) {
        var name = _.findWhere(vertex.properties, { name: ONTOLOGY_CONSTANTS.PROP_TITLE })
        var concept = _.findWhere(vertex.properties, { name: ONTOLOGY_CONSTANTS.PROP_CONCEPT_TYPE })
        if (concept && concept.value === ONTOLOGY_CONSTANTS.CONCEPT_TYPE_PERSON && !name) {
            classes.push('unknownName')
        }
    });

    bc.registry.registerExtension('org.bigconnect.graph.style', function(cytoscapeStylesheet) {
         cytoscapeStylesheet.selector('node.unknownName')
             .style({
                 'opacity': '0.75'
             })
    });

});
