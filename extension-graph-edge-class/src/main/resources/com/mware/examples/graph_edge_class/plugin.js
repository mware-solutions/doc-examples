require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.edge.class', function(edges, type, classes) {
        var hasComment = _.any(edges, function(edge) {
            var comment = _.findWhere(edge.properties, { name: 'http://bigconnect.io/comment#entry' })
            return comment && comment.value.indexOf('class') >= 0;
        });

        if (hasComment) {
            classes.push('hasComment')
        }
    });

    bc.registry.registerExtension('com.mware.graph.style', function(cytoscapeStylesheet) {
         cytoscapeStylesheet.selector('edge.hasComment')
             .style({
                 color: '#ff0000',
                 'line-color': '#ff0000',
                 'target-arrow-color': '#ff0000',
                 width: 5
             })
    });
});
