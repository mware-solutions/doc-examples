require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.detail.toolbar', {
        title: i18n('com.mware.examples.detail_toolbar.google'),
        event: 'detail-toolbar-google',
        canHandle: function(objects) {
            return objects.vertices.length === 1 && objects.edges.length === 0
                && /#person$/.test(objects.vertices[0].conceptType);
        }
    });

    bc.connect().then(function(api) {
        $(document).on('detail-toolbar-google', function(e, data) {
            var person = data.vertices[0];
            var name = api.formatters.vertex.title(person);
            var url = 'http://www.google.com/#safe=on&q=' + name;
            window.open(url, '_blank');
        });
    });
});
