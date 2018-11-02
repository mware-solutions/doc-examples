require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.entity.listItemRenderer', {
        canHandle: function(element, usageContext) {
            return usageContext === 'searchresults';
        },
        componentPath: 'com/mware/examples/entity_listitemrenderer/component'
    });

});
