class HTMLGenerator {
    // Método para crear el título
    createTitle(title) {
        return `<title>${title}</title>\n`;
    }

    // Método para un encabezado
    createHeader(header, level) {
        if (level < 1 || level > 6) {
            return ''; // Niveles de encabezado válidos son del 1 al 6
        }
        return `<h${level}>${header}</h${level}>\n`;
    }

    // Método para un parrafo
    createParagraph(text) {
        return `<p>${text}</p>\n`;
    }

    // Método para un enlace
    createLink(url, text) {
        return `<a href="${url}">${text}</a>\n`;
    }

    // Método para una lista
    createList(items, ordered) {
        const listTag = ordered ? 'ol' : 'ul';
        let listHTML = `<${listTag}>\n`;
        items.forEach(item => {
            listHTML += `  <li>${item}</li>\n`;
        });
        listHTML += `</${listTag}>\n`;
        return listHTML;
    }
}

// a continuacion un ejemplo de uso
const generator = new HTMLGenerator();
let html = '';
html += generator.createTitle("Grupo Camotitos");
html += generator.createHeader("Bienvenido a la página del Grupo Camotitos", 1);
html += generator.createParagraph("Esta es una página simple creada en JavaScript.");
html += generator.createLink("https://example.com", "haga clic aquí para visitar");
html += generator.createList(["Elemento 1", "Elemento 2", "Elemento 3"], true);

// Ahora se muestra el HTML generado
console.log(html);
