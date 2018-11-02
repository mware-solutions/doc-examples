require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.detail.text', {
        shouldReplaceTextSectionForVertex: function(vertex, name, key) {
            return true;
        },
        componentPath: 'com/mware/examples/detail_text/Example'
    });

});
