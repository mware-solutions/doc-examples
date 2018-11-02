require(['public/v1/api'], function(bc) {

    var doRandomSelection = function(cy) {
        var elements = cy.elements('.v,.e').unselect(),
            randomIndex = Math.floor(Math.random() * elements.length);
        elements[randomIndex].select();
    }
    doRandomSelection.identifier = 'com.mware-examples-graph-selection';
    doRandomSelection.visibility = 'always';

    bc.registry.registerExtension('org.bigconnect.graph.selection', doRandomSelection);
});
