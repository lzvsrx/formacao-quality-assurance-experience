import { test, expect } from '@playwright/test';
test('cadastro com nome', async ({ page }) => {
 await page.goto('http://127.0.0.1:5173');
 await page.getByLabel('Nome').fill('Maria');
 await page.getByRole('button', {name:'Enviar'}).click();
 await expect(page.getByRole('status')).toHaveText('Olá, Maria!');
});
