define(['util/vertex/formatters'], function(F) {
    'use strict';

    return [
        {
            identifier: 'org.bigconnect.layout.text',
            render: function(el, model, config) {
                if (config && config.style && _.isString(config.style)) {
                    var cls = config.style;
                    switch (config.style) {
                      case 'title':
                      case 'subtitle':
                      case 'heading1':
                      case 'heading2':
                      case 'heading3':
                      case 'body':
                      case 'footnote':
                        break;
                      default:
                        throw new Error('Unknown config style: ' + config.style)
                    }
                    el.classList.add(config.style)
                }

                if (config.truncate) {
                    const text = String(model);
                    el.textContent = F.string.truncate(text, config.truncate);
                    el.title = text;
                } else {
                    el.textContent = String(model);
                }
            }
        },
        {
            identifier: 'org.bigconnect.layout.body',
            applyTo: function(model, options) {
                var enoughWidth = !_.contains(options.constraints, 'width');
                if (enoughWidth) {
                    var comment = _.findWhere(model.properties, { name: ONTOLOGY_CONSTANTS.PROP_COMMENT_ENTRY }),
                        hasRelations = !_.isEmpty(model.edgeLabels);
                    return comment || hasRelations;
                }
                return false;
            },
            children: [
                { ref: 'org.bigconnect.layout.body.split' },
                { componentPath: 'detail/text/text', className: 'org-bigconnect-texts' }
            ]
        },
        {
            identifier: 'org.bigconnect.layout.body.split',
            layout: { type: 'flex', options: { direction: 'row' }},
            children: [
                { ref: 'org.bigconnect.layout.body.left', style: { flex: 1 }},
                { ref: 'org.bigconnect.layout.body.right', style: { flex: 1 }}
            ]
        },
        {
            identifier: 'org.bigconnect.layout.body.left',
            children: [
                { componentPath: 'detail/properties/properties', className: 'org-bigconnect-properties', modelAttribute: 'data' }
            ]
        },
        {
            identifier: 'org.bigconnect.layout.body.right',
            children: [
                { componentPath: 'comments/comments', className: 'org.bigconnect-comments', modelAttribute: 'data' },
                { componentPath: 'detail/relationships/relationships', className: 'org-bigconnect-relationships', modelAttribute: 'data' }
            ]
        },
        {
            identifier: 'org.bigconnect.layout.body',
            children: [
                { componentPath: 'detail/properties/properties', className: 'org-bigconnect-properties', modelAttribute: 'data' },
                { componentPath: 'comments/comments', className: 'org.bigconnect-comments', modelAttribute: 'data' },
                { componentPath: 'detail/relationships/relationships', className: 'org-bigconnect-relationships', modelAttribute: 'data' },
                { componentPath: 'detail/text/text', className: 'org-bigconnect-texts' }
            ]
        },
        {
            identifier: 'org.bigconnect.layout.header',
            children: [
                { ref: 'org.bigconnect.layout.header.text' },
                { componentPath: 'detail/toolbar/toolbar', className: 'bc-toolbar' }
            ]
        }
    ];
});
